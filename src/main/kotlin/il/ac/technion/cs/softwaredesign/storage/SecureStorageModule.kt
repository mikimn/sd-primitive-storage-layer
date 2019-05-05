package il.ac.technion.cs.softwaredesign.storage

import com.authzee.kotlinguice4.KotlinModule
import il.ac.technion.cs.softwaredesign.storage.impl.SecureStorageFactoryImpl
import il.ac.technion.cs.softwaredesign.storage.impl.SecureStorageImpl

class SecureStorageModule : KotlinModule() {
    override fun configure() {
        bind<SecureStorage>().to<SecureStorageImpl>()
        bind<SecureStorageFactory>().to<SecureStorageFactoryImpl>()
    }
}