package com.google.api.client.util;

import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Data {
    public static final BigDecimal NULL_BIG_DECIMAL;
    public static final BigInteger NULL_BIG_INTEGER;
    public static final Boolean NULL_BOOLEAN;
    public static final Byte NULL_BYTE;
    private static final ConcurrentHashMap<Class<?>, Object> NULL_CACHE;
    public static final Character NULL_CHARACTER;
    public static final DateTime NULL_DATE_TIME;
    public static final Double NULL_DOUBLE;
    public static final Float NULL_FLOAT;
    public static final Integer NULL_INTEGER;
    public static final Long NULL_LONG;
    public static final Short NULL_SHORT;
    public static final String NULL_STRING;

    static {
        Boolean bool = new Boolean(true);
        NULL_BOOLEAN = bool;
        String str = new String();
        NULL_STRING = str;
        Character ch2 = new Character((char) 0);
        NULL_CHARACTER = ch2;
        Byte b10 = new Byte((byte) 0);
        NULL_BYTE = b10;
        Short sh2 = new Short((short) 0);
        NULL_SHORT = sh2;
        Integer num = new Integer(0);
        NULL_INTEGER = num;
        Float f10 = new Float(0.0f);
        NULL_FLOAT = f10;
        Long l10 = new Long(0L);
        NULL_LONG = l10;
        Double d10 = new Double(0.0d);
        NULL_DOUBLE = d10;
        BigInteger bigInteger = new BigInteger(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        NULL_BIG_INTEGER = bigInteger;
        BigDecimal bigDecimal = new BigDecimal(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        NULL_BIG_DECIMAL = bigDecimal;
        DateTime dateTime = new DateTime(0L);
        NULL_DATE_TIME = dateTime;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        NULL_CACHE = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch2);
        concurrentHashMap.put(Byte.class, b10);
        concurrentHashMap.put(Short.class, sh2);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f10);
        concurrentHashMap.put(Long.class, l10);
        concurrentHashMap.put(Double.class, d10);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(DateTime.class, dateTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T clone(T t10) {
        T t11;
        if (t10 == 0 || isPrimitive(t10.getClass())) {
            return t10;
        }
        if (t10 instanceof GenericData) {
            return (T) ((GenericData) t10).clone();
        }
        Class<?> cls = t10.getClass();
        if (cls.isArray()) {
            t11 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t10));
        } else if (t10 instanceof ArrayMap) {
            t11 = (T) ((ArrayMap) t10).clone();
        } else {
            if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                Object[] array = ((List) t10).toArray();
                deepCopy(array, array);
                return (T) Arrays.asList(array);
            }
            t11 = (T) Types.newInstance(cls);
        }
        deepCopy(t10, t11);
        return t11;
    }

    private static Object createNullInstance(Class<?> cls) {
        if (cls.isArray()) {
            int i10 = 0;
            do {
                cls = cls.getComponentType();
                i10++;
            } while (cls.isArray());
            return Array.newInstance(cls, new int[i10]);
        }
        if (!cls.isEnum()) {
            return Types.newInstance(cls);
        }
        FieldInfo fieldInfo = ClassInfo.of(cls).getFieldInfo(null);
        Preconditions.checkNotNull(fieldInfo, "enum missing constant with @NullValue annotation: %s", cls);
        return fieldInfo.enumValue();
    }

    public static void deepCopy(Object obj, Object obj2) {
        Class<?> cls = obj.getClass();
        int i10 = 0;
        Preconditions.checkArgument(cls == obj2.getClass());
        if (cls.isArray()) {
            Preconditions.checkArgument(Array.getLength(obj) == Array.getLength(obj2));
            Iterator it = Types.iterableOf(obj).iterator();
            while (it.hasNext()) {
                Array.set(obj2, i10, clone(it.next()));
                i10++;
            }
            return;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            Collection collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                collection2.add(clone(it2.next()));
            }
            return;
        }
        boolean zIsAssignableFrom = GenericData.class.isAssignableFrom(cls);
        if (zIsAssignableFrom || !Map.class.isAssignableFrom(cls)) {
            ClassInfo classInfoOf = zIsAssignableFrom ? ((GenericData) obj).classInfo : ClassInfo.of(cls);
            Iterator<String> it3 = classInfoOf.names.iterator();
            while (it3.hasNext()) {
                FieldInfo fieldInfo = classInfoOf.getFieldInfo(it3.next());
                if (!fieldInfo.isFinal() && (!zIsAssignableFrom || !fieldInfo.isPrimitive())) {
                    Object value = fieldInfo.getValue(obj);
                    if (value != null) {
                        fieldInfo.setValue(obj2, clone(value));
                    }
                }
            }
            return;
        }
        if (!ArrayMap.class.isAssignableFrom(cls)) {
            Map map = (Map) obj2;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                map.put(entry.getKey(), clone(entry.getValue()));
            }
            return;
        }
        ArrayMap arrayMap = (ArrayMap) obj2;
        ArrayMap arrayMap2 = (ArrayMap) obj;
        int size = arrayMap2.size();
        while (i10 < size) {
            arrayMap.set(i10, clone(arrayMap2.getValue(i10)));
            i10++;
        }
    }

    public static boolean isNull(Object obj) {
        return obj != null && obj == NULL_CACHE.get(obj.getClass());
    }

    public static boolean isPrimitive(Type type) {
        if (type instanceof WildcardType) {
            type = Types.getBound((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class cls = (Class) type;
        return cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == DateTime.class || cls == Boolean.class;
    }

    public static boolean isValueOfPrimitiveType(Object obj) {
        return obj == null || isPrimitive(obj.getClass());
    }

    public static Map<String, Object> mapOf(Object obj) {
        if (obj == null || isNull(obj)) {
            return Collections.EMPTY_MAP;
        }
        return obj instanceof Map ? (Map) obj : new DataMap(obj, false);
    }

    public static Collection<Object> newCollectionInstance(Type type) {
        if (type instanceof WildcardType) {
            type = Types.getBound((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls != null) {
            if (cls.isAssignableFrom(HashSet.class)) {
                return new HashSet();
            }
            return cls.isAssignableFrom(TreeSet.class) ? new TreeSet() : (Collection) Types.newInstance(cls);
        }
        throw new IllegalArgumentException("unable to create new instance of type: " + type);
    }

    public static Map<String, Object> newMapInstance(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(ArrayMap.class)) {
            return ArrayMap.create();
        }
        return cls.isAssignableFrom(TreeMap.class) ? new TreeMap() : (Map) Types.newInstance(cls);
    }

    public static <T> T nullOf(Class<T> cls) {
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = NULL_CACHE;
        T t10 = (T) concurrentHashMap.get(cls);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) createNullInstance(cls);
        T t12 = (T) concurrentHashMap.putIfAbsent((Class<?>) cls, t11);
        return t12 == null ? t11 : t12;
    }

    public static Object parsePrimitiveValue(Type type, String str) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                throw new IllegalArgumentException("expected type Character/char but got " + cls);
            }
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            }
            if (cls == Byte.class || cls == Byte.TYPE) {
                return Byte.valueOf(str);
            }
            if (cls == Short.class || cls == Short.TYPE) {
                return Short.valueOf(str);
            }
            if (cls == Integer.class || cls == Integer.TYPE) {
                return Integer.valueOf(str);
            }
            if (cls == Long.class || cls == Long.TYPE) {
                return Long.valueOf(str);
            }
            if (cls == Float.class || cls == Float.TYPE) {
                return Float.valueOf(str);
            }
            if (cls == Double.class || cls == Double.TYPE) {
                return Double.valueOf(str);
            }
            if (cls == DateTime.class) {
                return DateTime.parseRfc3339(str);
            }
            if (cls == BigInteger.class) {
                return new BigInteger(str);
            }
            if (cls == BigDecimal.class) {
                return new BigDecimal(str);
            }
            if (cls.isEnum()) {
                if (ClassInfo.of(cls).names.contains(str)) {
                    return ClassInfo.of(cls).getFieldInfo(str).enumValue();
                }
                throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", str));
            }
        }
        throw new IllegalArgumentException("expected primitive class, but got: " + type);
    }

    public static Type resolveWildcardTypeOrTypeVariable(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = Types.getBound((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type typeResolveTypeVariable = Types.resolveTypeVariable(list, (TypeVariable) type);
            if (typeResolveTypeVariable != null) {
                type = typeResolveTypeVariable;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
