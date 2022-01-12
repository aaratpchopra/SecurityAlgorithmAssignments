package com.company;

import com.company.encryption.CaesarCypher;
import com.company.encryption.EncryptWithStaticKey;
import com.company.encryption.ModifiedCaesarCypher;

public class Main {
    public static void main(String[] args) {
        EncryptWithStaticKey.encrypt_static_key("AARAT");
        CaesarCypher.caesarCipher("AARAT", 10);
        ModifiedCaesarCypher.modifiedCaesarCypher();
    }
}
