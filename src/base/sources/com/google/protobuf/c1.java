package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface c1 {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, p pVar);

    Object parseFrom(i iVar);

    Object parseFrom(i iVar, p pVar);

    Object parseFrom(j jVar);

    Object parseFrom(j jVar, p pVar);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, p pVar);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, p pVar);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, int i10, int i11);

    Object parseFrom(byte[] bArr, int i10, int i11, p pVar);

    Object parseFrom(byte[] bArr, p pVar);

    Object parsePartialDelimitedFrom(InputStream inputStream);

    Object parsePartialDelimitedFrom(InputStream inputStream, p pVar);

    Object parsePartialFrom(i iVar);

    Object parsePartialFrom(i iVar, p pVar);

    Object parsePartialFrom(j jVar);

    Object parsePartialFrom(j jVar, p pVar);

    Object parsePartialFrom(InputStream inputStream);

    Object parsePartialFrom(InputStream inputStream, p pVar);

    Object parsePartialFrom(byte[] bArr);

    Object parsePartialFrom(byte[] bArr, int i10, int i11);

    Object parsePartialFrom(byte[] bArr, int i10, int i11, p pVar);

    Object parsePartialFrom(byte[] bArr, p pVar);
}
