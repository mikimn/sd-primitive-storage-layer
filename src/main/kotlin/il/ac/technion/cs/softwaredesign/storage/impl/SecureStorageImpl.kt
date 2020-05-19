package il.ac.technion.cs.softwaredesign.storage.impl

import il.ac.technion.cs.softwaredesign.storage.SecureStorage
import java.util.concurrent.CompletableFuture

class SecureStorageImpl : SecureStorage {
    override fun write(key: ByteArray, value: ByteArray): CompletableFuture<Unit> =
        CompletableFuture.completedFuture(Unit)

    override fun read(key: ByteArray): CompletableFuture<ByteArray?> = CompletableFuture.completedFuture(null)
}