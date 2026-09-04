package com.google.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class w0 implements l1 {
    private final s0 defaultInstance;
    private final q extensionSchema;
    private final boolean hasExtensions;
    private final r1 unknownFieldSchema;

    private w0(r1 r1Var, q qVar, s0 s0Var) {
        this.unknownFieldSchema = r1Var;
        this.hasExtensions = qVar.hasExtensions(s0Var);
        this.extensionSchema = qVar;
        this.defaultInstance = s0Var;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(r1 r1Var, Object obj) {
        return r1Var.getSerializedSizeAsMessageSet(r1Var.getFromMessage(obj));
    }

    private <UT, UB, ET extends u.c> void mergeFromHelper(r1 r1Var, q qVar, Object obj, j1 j1Var, p pVar) throws Throwable {
        r1 r1Var2;
        Object builderFromMessage = r1Var.getBuilderFromMessage(obj);
        u mutableExtensions = qVar.getMutableExtensions(obj);
        while (j1Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                r1Var2 = r1Var;
                q qVar2 = qVar;
                j1 j1Var2 = j1Var;
                p pVar2 = pVar;
                try {
                    if (!parseMessageSetItemOrUnknownField(j1Var2, pVar2, qVar2, mutableExtensions, r1Var2, builderFromMessage)) {
                        r1Var2.setBuilderToMessage(obj, builderFromMessage);
                        return;
                    }
                    j1Var = j1Var2;
                    pVar = pVar2;
                    qVar = qVar2;
                    r1Var = r1Var2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    r1Var2.setBuilderToMessage(obj, builderFromMessage);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                r1Var2 = r1Var;
            }
        }
        r1Var.setBuilderToMessage(obj, builderFromMessage);
    }

    static <T> w0 newSchema(r1 r1Var, q qVar, s0 s0Var) {
        return new w0(r1Var, qVar, s0Var);
    }

    private <UT, UB, ET extends u.c> boolean parseMessageSetItemOrUnknownField(j1 j1Var, p pVar, q qVar, u uVar, r1 r1Var, UB ub2) throws InvalidProtocolBufferException {
        int tag = j1Var.getTag();
        int uInt32 = 0;
        if (tag != x1.MESSAGE_SET_ITEM_TAG) {
            if (x1.getTagWireType(tag) != 2) {
                return j1Var.skipField();
            }
            Object objFindExtensionByNumber = qVar.findExtensionByNumber(pVar, this.defaultInstance, x1.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return r1Var.mergeOneFieldFrom(ub2, j1Var, 0);
            }
            qVar.parseLengthPrefixedMessageSetItem(j1Var, objFindExtensionByNumber, pVar, uVar);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        i bytes = null;
        while (j1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = j1Var.getTag();
            if (tag2 == x1.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = j1Var.readUInt32();
                objFindExtensionByNumber2 = qVar.findExtensionByNumber(pVar, this.defaultInstance, uInt32);
            } else if (tag2 == x1.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    qVar.parseLengthPrefixedMessageSetItem(j1Var, objFindExtensionByNumber2, pVar, uVar);
                } else {
                    bytes = j1Var.readBytes();
                }
            } else if (!j1Var.skipField()) {
                break;
            }
        }
        if (j1Var.getTag() != x1.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                qVar.parseMessageSetItem(bytes, objFindExtensionByNumber2, pVar, uVar);
            } else {
                r1Var.addLengthDelimited(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(r1 r1Var, Object obj, y1 y1Var) {
        r1Var.writeAsMessageSetTo(r1Var.getFromMessage(obj), y1Var);
    }

    @Override // com.google.protobuf.l1
    public boolean equals(Object obj, Object obj2) {
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize(Object obj) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.l1
    public int hashCode(Object obj) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.l1
    public final boolean isInitialized(Object obj) {
        return this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // com.google.protobuf.l1
    public void makeImmutable(Object obj) {
        this.unknownFieldSchema.makeImmutable(obj);
        this.extensionSchema.makeImmutable(obj);
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(Object obj, Object obj2) {
        n1.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            n1.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // com.google.protobuf.l1
    public Object newInstance() {
        s0 s0Var = this.defaultInstance;
        return s0Var instanceof y ? ((y) s0Var).newMutableInstance() : s0Var.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.l1
    public void writeTo(Object obj, y1 y1Var) {
        for (Map.Entry<u.c, Object> entry : this.extensionSchema.getExtensions(obj)) {
            u.c key = entry.getKey();
            if (key.getLiteJavaType() != x1.c.MESSAGE || key.isRepeated() || key.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof e0.b) {
                y1Var.writeMessageSetItem(key.getNumber(), ((e0.b) entry).getField().toByteString());
            } else {
                y1Var.writeMessageSetItem(key.getNumber(), entry.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, obj, y1Var);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // com.google.protobuf.l1
    public void mergeFrom(Object obj, byte[] bArr, int i10, int i11, e.b bVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32;
        y yVar = (y) obj;
        s1 s1VarNewInstance = yVar.unknownFields;
        if (s1VarNewInstance == s1.getDefaultInstance()) {
            s1VarNewInstance = s1.newInstance();
            yVar.unknownFields = s1VarNewInstance;
        }
        s1 s1Var = s1VarNewInstance;
        u uVarEnsureExtensionsAreMutable = ((y.d) obj).ensureExtensionsAreMutable();
        y.g gVar = null;
        while (i10 < i11) {
            int iDecodeVarint33 = e.decodeVarint32(bArr, i10, bVar);
            int i12 = bVar.int1;
            if (i12 == x1.MESSAGE_SET_ITEM_TAG) {
                int i13 = i11;
                e.b bVar2 = bVar;
                int i14 = 0;
                i iVar = null;
                while (true) {
                    if (iDecodeVarint33 >= i13) {
                        iDecodeVarint32 = iDecodeVarint33;
                        break;
                    }
                    iDecodeVarint32 = e.decodeVarint32(bArr, iDecodeVarint33, bVar2);
                    int i15 = bVar2.int1;
                    int tagFieldNumber = x1.getTagFieldNumber(i15);
                    int tagWireType = x1.getTagWireType(i15);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (gVar != null) {
                                iDecodeVarint33 = e.decodeMessageField(f1.getInstance().schemaFor((Class) gVar.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i13, bVar2);
                                uVarEnsureExtensionsAreMutable.setField(gVar.descriptor, bVar2.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint33 = e.decodeBytes(bArr, iDecodeVarint32, bVar2);
                                iVar = (i) bVar2.object1;
                            }
                        }
                        if (i15 == x1.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint33 = e.skipField(i15, bArr, iDecodeVarint32, i13, bVar2);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint33 = e.decodeVarint32(bArr, iDecodeVarint32, bVar2);
                        i14 = bVar2.int1;
                        gVar = (y.g) this.extensionSchema.findExtensionByNumber(bVar2.extensionRegistry, this.defaultInstance, i14);
                    } else {
                        if (i15 == x1.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                            break;
                        }
                        iDecodeVarint33 = e.skipField(i15, bArr, iDecodeVarint32, i13, bVar2);
                    }
                }
                if (iVar != null) {
                    s1Var.storeField(x1.makeTag(i14, 2), iVar);
                }
                i10 = iDecodeVarint32;
                i11 = i13;
                bVar = bVar2;
            } else if (x1.getTagWireType(i12) == 2) {
                gVar = (y.g) this.extensionSchema.findExtensionByNumber(bVar.extensionRegistry, this.defaultInstance, x1.getTagFieldNumber(i12));
                if (gVar != null) {
                    i10 = e.decodeMessageField(f1.getInstance().schemaFor((Class) gVar.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint33, i11, bVar);
                    uVarEnsureExtensionsAreMutable.setField(gVar.descriptor, bVar.object1);
                } else {
                    i10 = e.decodeUnknownField(i12, bArr, iDecodeVarint33, i11, s1Var, bVar);
                }
            } else {
                i10 = e.skipField(i12, bArr, iDecodeVarint33, i11, bVar);
            }
        }
        if (i10 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.l1
    public void mergeFrom(Object obj, j1 j1Var, p pVar) throws Throwable {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, j1Var, pVar);
    }
}
