package com.google.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class q {
    q() {
    }

    abstract int extensionNumber(Map.Entry<?, ?> entry);

    abstract Object findExtensionByNumber(p pVar, s0 s0Var, int i10);

    abstract u getExtensions(Object obj);

    abstract u getMutableExtensions(Object obj);

    abstract boolean hasExtensions(s0 s0Var);

    abstract void makeImmutable(Object obj);

    abstract <UT, UB> UB parseExtension(Object obj, j1 j1Var, Object obj2, p pVar, u uVar, UB ub2, r1 r1Var);

    abstract void parseLengthPrefixedMessageSetItem(j1 j1Var, Object obj, p pVar, u uVar);

    abstract void parseMessageSetItem(i iVar, Object obj, p pVar, u uVar);

    abstract void serializeExtension(y1 y1Var, Map.Entry<?, ?> entry);

    abstract void setExtensions(Object obj, u uVar);
}
