package il.ac.technion.cs.softwaredesign.storage.impl

import il.ac.technion.cs.softwaredesign.storage.SecureStorage

class SecureStorageImpl : SecureStorage {
    override fun write(key: ByteArray, value: ByteArray) = Unit
    override fun read(key: ByteArray) = null
}