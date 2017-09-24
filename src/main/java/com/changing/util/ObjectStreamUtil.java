package com.changing.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Created by wuchangqing on 2017/2/10.
 */
public class ObjectStreamUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ObjectStreamUtil.class);

    public static <T> byte[] writeClassAndObject(T obj)  {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        byte[] serializeStr = new byte[0];
        try {
            oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.flush();
            baos.flush();
            serializeStr = null;
            serializeStr = baos.toByteArray();
        } catch (IOException e) {
            LOGGER.error("ObjectStreamUtil writeClassAndObject IOException", e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    LOGGER.error("ObjectStreamUtil close oos IOException", e);
                }
            }
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    LOGGER.error("ObjectStreamUtil close baos IOException", e);
                }
            }
        }
        return serializeStr;
    }

    public static <T> T readClassAndObject(byte[] obj, Class<T> clazz) {
        T t = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            bais = new ByteArrayInputStream(obj);
            ois = new ObjectInputStream(bais);
            return (T) ois.readObject();
        } catch (ClassNotFoundException e) {
            LOGGER.error("ObjectStreamUtil classNotFoundException", e);
        } catch (IOException e) {
            LOGGER.error("ObjectStreamUtil readClassAndObject IOException", e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    LOGGER.error("ObjectStreamUtil close ois IOException", e);
                }
            }
            if (bais != null) {
                try {
                    bais.close();
                } catch (IOException e) {
                    LOGGER.error("ObjectStreamUtil close bais IOException", e);
                }
            }
        }
        return t;
    }
}
