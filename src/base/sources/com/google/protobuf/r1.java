package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class r1 {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    r1() {
    }

    private final void mergeFrom(Object obj, j1 j1Var, int i10) {
        while (j1Var.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(obj, j1Var, i10)) {
        }
    }

    abstract void addFixed32(Object obj, int i10, int i11);

    abstract void addFixed64(Object obj, int i10, long j10);

    abstract void addGroup(Object obj, int i10, Object obj2);

    abstract void addLengthDelimited(Object obj, int i10, i iVar);

    abstract void addVarint(Object obj, int i10, long j10);

    abstract Object getBuilderFromMessage(Object obj);

    abstract Object getFromMessage(Object obj);

    abstract int getSerializedSize(Object obj);

    abstract int getSerializedSizeAsMessageSet(Object obj);

    abstract void makeImmutable(Object obj);

    abstract Object merge(Object obj, Object obj2);

    final boolean mergeOneFieldFrom(Object obj, j1 j1Var, int i10) throws InvalidProtocolBufferException {
        int tag = j1Var.getTag();
        int tagFieldNumber = x1.getTagFieldNumber(tag);
        int tagWireType = x1.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(obj, tagFieldNumber, j1Var.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(obj, tagFieldNumber, j1Var.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(obj, tagFieldNumber, j1Var.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(obj, tagFieldNumber, j1Var.readFixed32());
            return true;
        }
        Object objNewBuilder = newBuilder();
        int iMakeTag = x1.makeTag(tagFieldNumber, 4);
        int i11 = i10 + 1;
        if (i11 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(objNewBuilder, j1Var, i11);
        if (iMakeTag != j1Var.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(obj, tagFieldNumber, toImmutable(objNewBuilder));
        return true;
    }

    abstract Object newBuilder();

    abstract void setBuilderToMessage(Object obj, Object obj2);

    public void setRecursionLimit(int i10) {
        recursionLimit = i10;
    }

    abstract void setToMessage(Object obj, Object obj2);

    abstract boolean shouldDiscardUnknownFields(j1 j1Var);

    abstract Object toImmutable(Object obj);

    abstract void writeAsMessageSetTo(Object obj, y1 y1Var);

    abstract void writeTo(Object obj, y1 y1Var);
}
