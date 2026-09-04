package io;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b extends org.apache.http.message.a implements g, io.a, Cloneable, co.o {
    private final AtomicMarkableReference<mo.a> cancellableRef = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements mo.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ oo.d f41556a;

        a(oo.d dVar) {
            this.f41556a = dVar;
        }

        @Override // mo.a
        public boolean cancel() {
            this.f41556a.a();
            return true;
        }
    }

    /* JADX INFO: renamed from: io.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0632b implements mo.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ oo.f f41558a;

        C0632b(oo.f fVar) {
            this.f41558a = fVar;
        }

        @Override // mo.a
        public boolean cancel() {
            try {
                this.f41558a.d();
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    protected b() {
    }

    public void abort() {
        while (!this.cancellableRef.isMarked()) {
            mo.a reference = this.cancellableRef.getReference();
            if (this.cancellableRef.compareAndSet(reference, reference, false, true) && reference != null) {
                reference.cancel();
            }
        }
    }

    public Object clone() {
        b bVar = (b) super.clone();
        bVar.headergroup = (org.apache.http.message.q) lo.a.a(this.headergroup);
        bVar.params = (ep.d) lo.a.a(this.params);
        return bVar;
    }

    @Deprecated
    public void completed() {
        this.cancellableRef.set(null, false);
    }

    @Override // io.g
    public boolean isAborted() {
        return this.cancellableRef.isMarked();
    }

    public void reset() {
        boolean zIsMarked;
        mo.a reference;
        do {
            zIsMarked = this.cancellableRef.isMarked();
            reference = this.cancellableRef.getReference();
            if (reference != null) {
                reference.cancel();
            }
        } while (!this.cancellableRef.compareAndSet(reference, null, zIsMarked, false));
    }

    @Override // io.g
    public void setCancellable(mo.a aVar) {
        if (this.cancellableRef.compareAndSet(this.cancellableRef.getReference(), aVar, false, false)) {
            return;
        }
        aVar.cancel();
    }

    @Override // io.a
    @Deprecated
    public void setConnectionRequest(oo.d dVar) {
        setCancellable(new a(dVar));
    }

    @Override // io.a
    @Deprecated
    public void setReleaseTrigger(oo.f fVar) {
        setCancellable(new C0632b(fVar));
    }
}
