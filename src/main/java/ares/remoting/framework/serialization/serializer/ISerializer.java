package ares.remoting.framework.serialization.serializer;

/**
 * 
 * @author alan
 * @date 
 * @version 
 * 
 */
public interface ISerializer {

    /**
     * 序列化
     * @param obj
     * @return
     */
    public <T> byte[] serialize(T obj);

    /**
     * 反序列化
     * @param data
     * @param clazz
     * @return
     */
    public <T> T deserialize(byte[] data, Class<T> clazz);
}
