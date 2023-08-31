package net.sf.ntru.demo;

import net.sf.ntru.encrypt.EncryptionKeyPair;

public interface OutputNode {
    EncryptionKeyPair ntruKeyPair = null;
    byte[] encrypted = new byte[0];
}
