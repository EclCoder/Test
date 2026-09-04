package l6;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import m6.l;
import r5.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f43924c;

    private a(int i10, e eVar) {
        this.f43923b = i10;
        this.f43924c = eVar;
    }

    public static e c(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        this.f43924c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f43923b).array());
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f43923b == aVar.f43923b && this.f43924c.equals(aVar.f43924c)) {
                return true;
            }
        }
        return false;
    }

    @Override // r5.e
    public int hashCode() {
        return l.o(this.f43924c, this.f43923b);
    }
}
