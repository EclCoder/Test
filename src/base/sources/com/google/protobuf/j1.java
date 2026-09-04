package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
interface j1 {
    public static final int READ_DONE = Integer.MAX_VALUE;
    public static final int TAG_UNKNOWN = 0;

    int getFieldNumber();

    int getTag();

    <T> void mergeGroupField(T t10, l1 l1Var, p pVar);

    <T> void mergeMessageField(T t10, l1 l1Var, p pVar);

    boolean readBool();

    void readBoolList(List<Boolean> list);

    i readBytes();

    void readBytesList(List<i> list);

    double readDouble();

    void readDoubleList(List<Double> list);

    int readEnum();

    void readEnumList(List<Integer> list);

    int readFixed32();

    void readFixed32List(List<Integer> list);

    long readFixed64();

    void readFixed64List(List<Long> list);

    float readFloat();

    void readFloatList(List<Float> list);

    @Deprecated
    <T> T readGroup(Class<T> cls, p pVar);

    @Deprecated
    <T> T readGroupBySchemaWithCheck(l1 l1Var, p pVar);

    @Deprecated
    <T> void readGroupList(List<T> list, l1 l1Var, p pVar);

    @Deprecated
    <T> void readGroupList(List<T> list, Class<T> cls, p pVar);

    int readInt32();

    void readInt32List(List<Integer> list);

    long readInt64();

    void readInt64List(List<Long> list);

    <K, V> void readMap(Map<K, V> map, l0.b bVar, p pVar);

    <T> T readMessage(Class<T> cls, p pVar);

    <T> T readMessageBySchemaWithCheck(l1 l1Var, p pVar);

    <T> void readMessageList(List<T> list, l1 l1Var, p pVar);

    <T> void readMessageList(List<T> list, Class<T> cls, p pVar);

    int readSFixed32();

    void readSFixed32List(List<Integer> list);

    long readSFixed64();

    void readSFixed64List(List<Long> list);

    int readSInt32();

    void readSInt32List(List<Integer> list);

    long readSInt64();

    void readSInt64List(List<Long> list);

    String readString();

    void readStringList(List<String> list);

    void readStringListRequireUtf8(List<String> list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List<Integer> list);

    long readUInt64();

    void readUInt64List(List<Long> list);

    boolean shouldDiscardUnknownFields();

    boolean skipField();
}
