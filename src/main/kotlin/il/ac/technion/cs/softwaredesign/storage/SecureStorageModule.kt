package il.ac.technion.cs.softwaredesign.storage

import com.authzee.kotlinguice4.KotlinModule
import il.ac.technion.cs.softwaredesign.storage.impl.SecureStorageFactoryImpl

class SecureStorageModule : KotlinModule() {
    override fun configure() {
        bind<SecureStorageFactory>().to<SecureStorageFactoryImpl>()
    }
}