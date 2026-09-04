package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class t implements r5.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r5.k f11575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11576c;

    public t(r5.k kVar, boolean z10) {
        this.f11575b = kVar;
        this.f11576c = z10;
    }

    private t5.c d(Context context, t5.c cVar) {
        return c0.d(context.getResources(), cVar);
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        this.f11575b.a(messageDigest);
    }

    @Override // r5.k
    public t5.c b(Context context, t5.c cVar, int i10, int i11) {
        u5.d dVarH = com.bumptech.glide.c.e(context).h();
        Drawable drawable = (Drawable) cVar.get();
        t5.c cVarA = s.a(dVarH, drawable, i10, i11);
        if (cVarA != null) {
            t5.c cVarB = this.f11575b.b(context, cVarA, i10, i11);
            if (!cVarB.equals(cVarA)) {
                return d(context, cVarB);
            }
            cVarB.a();
            return cVar;
        }
        if (!this.f11576c) {
            return cVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f11575b.equals(((t) obj).f11575b);
        }
        return false;
    }

    @Override // r5.e
    public int hashCode() {
        return this.f11575b.hashCode();
    }

    public r5.k c() {
        return this;
    }
}
