package il.ac.technion.cs.softwaredesign.storage.impl

import il.ac.technion.cs.softwaredesign.storage.SecureStorage
import il.ac.technion.cs.softwaredesign.storage.SecureStorageFactory
import java.util.concurrent.CompletableFuture

class SecureStorageFactoryImpl : SecureStorageFactory {
    override fun open(name: ByteArray): CompletableFuture<SecureStorage> =
        CompletableFuture.completedFuture(SecureStorageImpl())
}