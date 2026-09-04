package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class N3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O3 f25304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f25305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dl f25306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f25307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O3 f25309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f25310g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(O3 o10, ArrayList arrayList, kl.f fVar) {
        super(2, fVar);
        this.f25309f = o10;
        this.f25310g = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new N3(this.f25309f, this.f25310g, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new N3(this.f25309f, this.f25310g, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0048 -> B:21:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:28:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00eb -> B:21:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ed -> B:21:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.N3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
