package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Nh extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ph f25353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ib f25354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f25355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nh(Ph ph2, Ib ib2, JSONObject jSONObject, kl.f fVar) {
        super(1, fVar);
        this.f25353a = ph2;
        this.f25354b = ib2;
        this.f25355c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Nh(this.f25353a, this.f25354b, this.f25355c, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Nh) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0047 A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:3:0x0006, B:11:0x0025, B:16:0x002c, B:17:0x0031, B:18:0x0032, B:20:0x0036, B:23:0x003b, B:25:0x003f, B:27:0x0043, B:29:0x0047), top: B:34:0x0006 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        try {
            Kb kb2 = this.f25353a.f25498e;
            Ib eventLogLevel = this.f25354b;
            kb2.getClass();
            kotlin.jvm.internal.s.h(eventLogLevel, "eventLogLevel");
            int iOrdinal = kb2.f25111a.ordinal();
            if (iOrdinal == 0) {
                this.f25353a.f25500g.add(this.f25355c);
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (eventLogLevel == Ib.STATE) {
                        this.f25353a.f25500g.add(this.f25355c);
                    }
                } else if (eventLogLevel == Ib.ERROR || eventLogLevel == Ib.STATE) {
                    this.f25353a.f25500g.add(this.f25355c);
                }
            } else if (eventLogLevel == Ib.DEBUG || eventLogLevel == Ib.ERROR || eventLogLevel == Ib.STATE) {
                this.f25353a.f25500g.add(this.f25355c);
            }
        } catch (Exception e10) {
            this.f25353a.getClass();
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
        return fl.g0.f38750a;
    }
}
