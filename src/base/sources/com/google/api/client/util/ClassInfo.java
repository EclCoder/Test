package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ClassInfo {
    private static final ConcurrentMap<Class<?>, ClassInfo> CACHE = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, ClassInfo> CACHE_IGNORE_CASE = new ConcurrentHashMap();
    private final Class<?> clazz;
    private final boolean ignoreCase;
    private final IdentityHashMap<String, FieldInfo> nameToFieldInfoMap = new IdentityHashMap<>();
    final List<String> names;

    private ClassInfo(Class<?> cls, boolean z10) {
        this.clazz = cls;
        this.ignoreCase = z10;
        Preconditions.checkArgument((z10 && cls.isEnum()) ? false : true, "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new Comparator<String>() { // from class: com.google.api.client.util.ClassInfo.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                if (Objects.equal(str, str2)) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            }
        });
        for (Field field : cls.getDeclaredFields()) {
            FieldInfo fieldInfoOf = FieldInfo.of(field);
            if (fieldInfoOf != null) {
                String name = fieldInfoOf.getName();
                name = z10 ? name.toLowerCase(Locale.US).intern() : name;
                FieldInfo fieldInfo = this.nameToFieldInfoMap.get(name);
                Preconditions.checkArgument(fieldInfo == null, "two fields have the same %sname <%s>: %s and %s", z10 ? "case-insensitive " : "", name, field, fieldInfo == null ? null : fieldInfo.getField());
                this.nameToFieldInfoMap.put(name, fieldInfoOf);
                treeSet.add(name);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            ClassInfo classInfoOf = of(superclass, z10);
            treeSet.addAll(classInfoOf.names);
            for (Map.Entry<String, FieldInfo> entry : classInfoOf.nameToFieldInfoMap.entrySet()) {
                String key = entry.getKey();
                if (!this.nameToFieldInfoMap.containsKey(key)) {
                    this.nameToFieldInfoMap.put(key, entry.getValue());
                }
            }
        }
        this.names = treeSet.isEmpty() ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public static ClassInfo of(Class<?> cls) {
        return of(cls, false);
    }

    public Field getField(String str) {
        FieldInfo fieldInfo = getFieldInfo(str);
        if (fieldInfo == null) {
            return null;
        }
        return fieldInfo.getField();
    }

    public FieldInfo getFieldInfo(String str) {
        if (str != null) {
            if (this.ignoreCase) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.nameToFieldInfoMap.get(str);
    }

    public Collection<FieldInfo> getFieldInfos() {
        return Collections.unmodifiableCollection(this.nameToFieldInfoMap.values());
    }

    public final boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public Collection<String> getNames() {
        return this.names;
    }

    public Class<?> getUnderlyingClass() {
        return this.clazz;
    }

    public boolean isEnum() {
        return this.clazz.isEnum();
    }

    public static ClassInfo of(Class<?> cls, boolean z10) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, ClassInfo> concurrentMap = z10 ? CACHE_IGNORE_CASE : CACHE;
        ClassInfo classInfo = concurrentMap.get(cls);
        if (classInfo != null) {
            return classInfo;
        }
        ClassInfo classInfo2 = new ClassInfo(cls, z10);
        ClassInfo classInfoPutIfAbsent = concurrentMap.putIfAbsent(cls, classInfo2);
        return classInfoPutIfAbsent == null ? classInfo2 : classInfoPutIfAbsent;
    }
}
