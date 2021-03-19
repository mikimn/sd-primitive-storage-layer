package il.ac.technion.cs.softwaredesign.storage

import dev.misfitlabs.kotlinguice4.KotlinModule
import il.ac.technion.cs.softwaredesign.storage.impl.SecureStorageFactoryImpl

class SecureStorageModule : KotlinModule() {
    override fun configure() {
        bind<SecureStorageFactory>().to<SecureStorageFactoryImpl>()
    }
}