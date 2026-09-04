package oj;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f48966d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        HARD((byte) 0),
        SOFT((byte) 1),
        DYNAMIC((byte) 2);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ ml.a f48971f = ml.b.a(d());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f48972a;

        a(byte b10) {
            this.f48972a = b10;
        }

        public static ml.a g() {
            return f48971f;
        }

        public final byte h() {
            return this.f48972a;
        }
    }

    public /* synthetic */ k(int i10, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? a.DYNAMIC : aVar);
    }

    @Override // oj.i
    public int c() {
        return 5;
    }

    @Override // oj.i
    public f d() {
        return f.SET_PEER_BANDWIDTH;
    }

    @Override // oj.i
    public void f(InputStream input) throws IOException {
        Object next;
        s.h(input, "input");
        this.f48965c = tj.e.e(input);
        byte b10 = (byte) input.read();
        Iterator<E> it = a.g().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a) next).h() != b10);
        a aVar = (a) next;
        if (aVar != null) {
            this.f48966d = aVar;
            return;
        }
        throw new IOException("Unknown bandwidth type: " + ((int) b10));
    }

    @Override // oj.i
    public byte[] g() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        tj.e.l(byteArrayOutputStream, this.f48965c);
        byteArrayOutputStream.write(this.f48966d.h());
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.g(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public String toString() {
        return "SetPeerBandwidth(acknowledgementWindowSize=" + this.f48965c + ", type=" + this.f48966d + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i10, a type) {
        super(new e(nj.b.TYPE_0, nj.a.PROTOCOL_CONTROL.g()));
        s.h(type, "type");
        this.f48965c = i10;
        this.f48966d = type;
    }
}
