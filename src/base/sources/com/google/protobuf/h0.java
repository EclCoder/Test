package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface h0 extends h1 {
    void add(i iVar);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends i> collection);

    List<byte[]> asByteArrayList();

    @Override // com.google.protobuf.h1
    /* synthetic */ List asByteStringList();

    byte[] getByteArray(int i10);

    i getByteString(int i10);

    Object getRaw(int i10);

    List<?> getUnderlyingElements();

    h0 getUnmodifiableView();

    void mergeFrom(h0 h0Var);

    void set(int i10, i iVar);

    void set(int i10, byte[] bArr);
}
