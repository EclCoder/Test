package d6;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import r5.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f36225b;

    public f(k kVar) {
        this.f36225b = (k) m6.k.e(kVar);
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        this.f36225b.a(messageDigest);
    }

    @Override // r5.k
    public t5.c b(Context context, t5.c cVar, int i10, int i11) {
        c cVar2 = (c) cVar.get();
        t5.c fVar = new com.bumptech.glide.load.resource.bitmap.f(cVar2.e(), com.bumptech.glide.c.e(context).h());
        t5.c cVarB = this.f36225b.b(context, fVar, i10, i11);
        if (!fVar.equals(cVarB)) {
            fVar.a();
        }
        cVar2.m(this.f36225b, (Bitmap) cVarB.get());
        return cVar;
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f36225b.equals(((f) obj).f36225b);
        }
        return false;
    }

    @Override // r5.e
    public int hashCode() {
        return this.f36225b.hashCode();
    }
}
