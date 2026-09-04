package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements c1 {
    private static final p EMPTY_REGISTRY = p.getEmptyRegistry();

    private s0 checkMessageInitialized(s0 s0Var) throws InvalidProtocolBufferException {
        if (s0Var == null || s0Var.isInitialized()) {
            return s0Var;
        }
        throw newUninitializedMessageException(s0Var).asInvalidProtocolBufferException().setUnfinishedMessage(s0Var);
    }

    private UninitializedMessageException newUninitializedMessageException(s0 s0Var) {
        return s0Var instanceof a ? ((a) s0Var).newUninitializedMessageException() : new UninitializedMessageException(s0Var);
    }

    @Override // com.google.protobuf.c1
    public abstract /* synthetic */ Object parsePartialFrom(j jVar, p pVar);

    @Override // com.google.protobuf.c1
    public s0 parseDelimitedFrom(InputStream inputStream, p pVar) {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, pVar));
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialDelimitedFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new a.AbstractC0331a.C0332a(inputStream, j.readRawVarint32(i10, inputStream)), pVar);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10);
        }
    }

    @Override // com.google.protobuf.c1
    public s0 parseDelimitedFrom(InputStream inputStream) {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialDelimitedFrom(InputStream inputStream) {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialFrom(j jVar) {
        return (s0) parsePartialFrom(jVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialFrom(i iVar, p pVar) throws InvalidProtocolBufferException {
        j jVarNewCodedInput = iVar.newCodedInput();
        s0 s0Var = (s0) parsePartialFrom(jVarNewCodedInput, pVar);
        try {
            jVarNewCodedInput.checkLastTagWas(0);
            return s0Var;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(s0Var);
        }
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(j jVar, p pVar) {
        return checkMessageInitialized((s0) parsePartialFrom(jVar, pVar));
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(j jVar) {
        return parseFrom(jVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(i iVar, p pVar) {
        return checkMessageInitialized(parsePartialFrom(iVar, pVar));
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialFrom(i iVar) {
        return parsePartialFrom(iVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(i iVar) {
        return parseFrom(iVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialFrom(byte[] bArr, int i10, int i11, p pVar) throws InvalidProtocolBufferException {
        j jVarNewInstance = j.newInstance(bArr, i10, i11);
        s0 s0Var = (s0) parsePartialFrom(jVarNewInstance, pVar);
        try {
            jVarNewInstance.checkLastTagWas(0);
            return s0Var;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(s0Var);
        }
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(ByteBuffer byteBuffer, p pVar) throws InvalidProtocolBufferException {
        j jVarNewInstance = j.newInstance(byteBuffer);
        s0 s0Var = (s0) parsePartialFrom(jVarNewInstance, pVar);
        try {
            jVarNewInstance.checkLastTagWas(0);
            return checkMessageInitialized(s0Var);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(s0Var);
        }
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialFrom(byte[] bArr, int i10, int i11) {
        return parsePartialFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialFrom(byte[] bArr, p pVar) {
        return parsePartialFrom(bArr, 0, bArr.length, pVar);
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(ByteBuffer byteBuffer) {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialFrom(byte[] bArr) {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(byte[] bArr, int i10, int i11, p pVar) {
        return checkMessageInitialized(parsePartialFrom(bArr, i10, i11, pVar));
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialFrom(InputStream inputStream, p pVar) throws InvalidProtocolBufferException {
        j jVarNewInstance = j.newInstance(inputStream);
        s0 s0Var = (s0) parsePartialFrom(jVarNewInstance, pVar);
        try {
            jVarNewInstance.checkLastTagWas(0);
            return s0Var;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(s0Var);
        }
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(byte[] bArr, int i10, int i11) {
        return parseFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(byte[] bArr, p pVar) {
        return parseFrom(bArr, 0, bArr.length, pVar);
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(byte[] bArr) {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(InputStream inputStream, p pVar) {
        return checkMessageInitialized(parsePartialFrom(inputStream, pVar));
    }

    @Override // com.google.protobuf.c1
    public s0 parsePartialFrom(InputStream inputStream) {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.c1
    public s0 parseFrom(InputStream inputStream) {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
