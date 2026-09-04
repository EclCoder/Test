package qj;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import oj.e;
import oj.f;
import oj.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f50876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f50877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f50878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b type, a event) {
        super(new e(nj.b.TYPE_0, nj.a.PROTOCOL_CONTROL.g()));
        s.h(type, "type");
        s.h(event, "event");
        this.f50876c = type;
        this.f50877d = event;
        this.f50878e = "UserControl";
        this.f50879f = 6;
    }

    @Override // oj.i
    public int c() {
        return this.f50879f;
    }

    @Override // oj.i
    public f d() {
        return f.USER_CONTROL;
    }

    @Override // oj.i
    public void f(InputStream input) throws IOException {
        Object next;
        s.h(input, "input");
        this.f50879f = 0;
        int iC = tj.e.c(input);
        Iterator<E> it = b.g().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((b) next).h() != iC);
        b bVar = (b) next;
        if (bVar == null) {
            throw new IOException("unknown user control type: " + iC);
        }
        this.f50876c = bVar;
        this.f50879f += 2;
        int iE = tj.e.e(input);
        this.f50879f += 4;
        this.f50877d = this.f50876c == b.SET_BUFFER_LENGTH ? new a(iE, tj.e.e(input)) : new a(iE, 0, 2, null);
    }

    @Override // oj.i
    public byte[] g() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        tj.e.j(byteArrayOutputStream, this.f50876c.h());
        tj.e.l(byteArrayOutputStream, this.f50877d.b());
        if (this.f50877d.a() != -1) {
            tj.e.l(byteArrayOutputStream, this.f50877d.a());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.g(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final a k() {
        return this.f50877d;
    }

    public final b l() {
        return this.f50876c;
    }

    public String toString() {
        return "UserControl(type=" + this.f50876c + ", event=" + this.f50877d + ", bodySize=" + this.f50879f + ")";
    }

    public /* synthetic */ c(b bVar, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? b.PING_REQUEST : bVar, (i10 & 2) != 0 ? new a(-1, -1) : aVar);
    }
}
