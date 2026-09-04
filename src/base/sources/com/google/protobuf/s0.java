package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface s0 extends t0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a extends t0, Cloneable {
        s0 build();

        s0 buildPartial();

        a clear();

        /* JADX INFO: renamed from: clone */
        a mo45clone();

        @Override // com.google.protobuf.t0
        /* synthetic */ s0 getDefaultInstanceForType();

        @Override // com.google.protobuf.t0
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream);

        boolean mergeDelimitedFrom(InputStream inputStream, p pVar);

        a mergeFrom(i iVar);

        a mergeFrom(i iVar, p pVar);

        a mergeFrom(j jVar);

        a mergeFrom(j jVar, p pVar);

        a mergeFrom(s0 s0Var);

        a mergeFrom(InputStream inputStream);

        a mergeFrom(InputStream inputStream, p pVar);

        a mergeFrom(byte[] bArr);

        a mergeFrom(byte[] bArr, int i10, int i11);

        a mergeFrom(byte[] bArr, int i10, int i11, p pVar);

        a mergeFrom(byte[] bArr, p pVar);
    }

    @Override // com.google.protobuf.t0
    /* synthetic */ s0 getDefaultInstanceForType();

    c1 getParserForType();

    int getSerializedSize();

    @Override // com.google.protobuf.t0
    /* synthetic */ boolean isInitialized();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    i toByteString();

    void writeDelimitedTo(OutputStream outputStream);

    void writeTo(CodedOutputStream codedOutputStream);

    void writeTo(OutputStream outputStream);
}
