package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1.b f3910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f3911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f3912c = new a(UserVerificationMethods.USER_VERIFY_ALL);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f3913d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f3914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f3915b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f3914a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final o b() {
            return this.f3915b;
        }

        void c(o oVar, int i10, int i11) {
            a aVarA = a(oVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f3914a.put(oVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(oVar, i10 + 1, i11);
            } else {
                aVarA.f3915b = oVar;
            }
        }

        a(int i10) {
            this.f3914a = new SparseArray(i10);
        }
    }

    private m(Typeface typeface, g1.b bVar) {
        this.f3913d = typeface;
        this.f3910a = bVar;
        this.f3911b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(g1.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            o oVar = new o(this, i10);
            Character.toChars(oVar.f(), this.f3911b, i10 * 2);
            h(oVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            j0.o.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            j0.o.b();
        }
    }

    public char[] c() {
        return this.f3911b;
    }

    public g1.b d() {
        return this.f3910a;
    }

    int e() {
        return this.f3910a.l();
    }

    a f() {
        return this.f3912c;
    }

    Typeface g() {
        return this.f3913d;
    }

    void h(o oVar) {
        m0.g.h(oVar, "emoji metadata cannot be null");
        m0.g.b(oVar.c() > 0, "invalid metadata codepoint length");
        this.f3912c.c(oVar, 0, oVar.c() - 1);
    }
}
