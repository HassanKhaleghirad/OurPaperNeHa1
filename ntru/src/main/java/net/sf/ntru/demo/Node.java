package net.sf.ntru.demo;

import net.sf.ntru.encrypt.EncryptionKeyPair;
import net.sf.ntru.encrypt.EncryptionParameters;
import net.sf.ntru.encrypt.NtruEncrypt;

import javax.crypto.Cipher;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class Node {

     String aesMode = "AES/CBC/PKCS5Padding";
    int aesLength = 128;
    EncryptionParameters ntruParams = EncryptionParameters.APR2011_439_FAST;


    public byte[] decrypt(byte[] encrypted, EncryptionKeyPair kp) throws Exception {
        NtruEncrypt ntru = new NtruEncrypt(ntruParams);

        // decrypt the NTRU block to obtain the AES key and the IV
        byte[] ntruEncrypted = Arrays.copyOf(encrypted, ntruParams.getOutputLength());
        byte[] keyAndIv = ntru.decrypt(ntruEncrypted, kp);
        byte[] aesKeyArr = Arrays.copyOf(keyAndIv, aesLength/8);
        byte[] ivArr = Arrays.copyOfRange(keyAndIv, aesLength/8, 2*aesLength/8);

        // use the AES key and IV to decrypt the plain text
        byte[] aesEncrypted = Arrays.copyOfRange(encrypted, ntruEncrypted.length, encrypted.length);
        Cipher cipher = Cipher.getInstance(aesMode);
        SecretKeySpec aesKeySpec = new SecretKeySpec(aesKeyArr, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(ivArr);
        cipher.init(Cipher.DECRYPT_MODE, aesKeySpec, ivSpec);
        byte[] plainText = cipher.doFinal(aesEncrypted);

        return plainText;
    }


}
