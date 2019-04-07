package il.ac.technion.cs.softwaredesign

/**
 * Write to a key. If this key was already associated to some value, the previous value is discarded.
 *
 * @param key Data to be used as a key.
 * @param value The value to write.
 */
fun write(key: ByteArray, value: ByteArray) = Unit

/**
 * Read value from a key. If there is no value for this key, an empty byte array is returned.
 *
 * @param key Data to be used as a key.
 * @return Value associated with [key].
 */
fun read(key: ByteArray): ByteArray = byteArrayOf()