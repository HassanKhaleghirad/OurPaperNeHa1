# OurPaperNeHa1

mvn install:install-file \
   -Dfile=<path-to-file> \
   -DgroupId=<group-id> \
   -DartifactId=<artifact-id> \
   -Dversion=<version> \
   -Dpackaging=<packaging> \
   -DgeneratePom=true
   #
   
        mvn install:install-file -Dfile=</home/hassan/saeed/keccakj-1.1.0.jar> -DgroupId=<com.github.aelstad> -DartifactId=<keccakj> -Dversion=<1.1.0> -Dpackaging=<jar> -DgeneratePom=true

#ok

 mvn install:install-file -Dfile=/home/hassan/saeed/keccakj-1.1.0.jar -DgroupId=com.github.aelstad -DartifactId=keccakj -Dversion=1.1.0 -Dpackaging=jar -DgeneratePom=true




java -jar ./ntru-1.0-SNAPSHOT.jar -XX:ActiveProcessorCount=1
