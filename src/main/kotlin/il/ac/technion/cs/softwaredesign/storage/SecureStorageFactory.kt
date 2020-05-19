package il.ac.technion.cs.softwaredesign.storage

import java.util.concurrent.CompletableFuture

interface SecureStorageFactory {
    fun open(name: ByteArray): CompletableFuture<SecureStorage>
}