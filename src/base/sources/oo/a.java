package oo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class a extends org.apache.http.entity.e implements f, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected p f49197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f49198c;

    public a(co.j jVar, p pVar, boolean z10) {
        super(jVar);
        ip.a.h(pVar, "Connection");
        this.f49197b = pVar;
        this.f49198c = z10;
    }

    private void f() {
        p pVar = this.f49197b;
        if (pVar == null) {
            return;
        }
        try {
            if (this.f49198c) {
                ip.e.a(this.f49262a);
                this.f49197b.U();
            } else {
                pVar.w0();
            }
        } finally {
            g();
        }
    }

    @Override // oo.j
    public boolean a(InputStream inputStream) {
        try {
            p pVar = this.f49197b;
            if (pVar != null) {
                if (this.f49198c) {
                    inputStream.close();
                    this.f49197b.U();
                } else {
                    pVar.w0();
                }
            }
            return false;
        } finally {
            g();
        }
    }

    @Override // oo.j
    public boolean c(InputStream inputStream) {
        p pVar = this.f49197b;
        if (pVar == null) {
            return false;
        }
        pVar.d();
        return false;
    }

    @Override // oo.f
    public void d() {
        p pVar = this.f49197b;
        if (pVar != null) {
            try {
                pVar.d();
            } finally {
                this.f49197b = null;
            }
        }
    }

    @Override // oo.j
    public boolean e(InputStream inputStream) {
        try {
            p pVar = this.f49197b;
            if (pVar != null) {
                if (this.f49198c) {
                    boolean zIsOpen = pVar.isOpen();
                    try {
                        inputStream.close();
                        this.f49197b.U();
                    } catch (SocketException e10) {
                        if (zIsOpen) {
                            throw e10;
                        }
                    }
                } else {
                    pVar.w0();
                }
            }
            g();
            return false;
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    protected void g() {
        p pVar = this.f49197b;
        if (pVar != null) {
            try {
                pVar.h();
            } finally {
                this.f49197b = null;
            }
        }
    }

    @Override // org.apache.http.entity.e, co.j
    public InputStream getContent() {
        return new i(this.f49262a.getContent(), this);
    }

    @Override // org.apache.http.entity.e, co.j
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.entity.e, co.j
    public void writeTo(OutputStream outputStream) {
        super.writeTo(outputStream);
        f();
    }
}
