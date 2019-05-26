package il.ac.technion.cs.softwaredesign.storage

import java.util.concurrent.CompletableFuture

interface SecureStorageFactory {
    /**
     * Open a secure storage, identified by [name]. If [name] does not identify a current secure storage, a new one is
     * created.
     */
    fun open(name: ByteArray): CompletableFuture<SecureStorage>
}