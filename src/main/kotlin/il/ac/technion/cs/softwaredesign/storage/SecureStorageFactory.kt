package il.ac.technion.cs.softwaredesign.storage

interface SecureStorageFactory {
    fun open(name: ByteArray): SecureStorage
}