package ok;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c implements f {
    public static int b() {
        return b.a();
    }

    public static c c(e eVar) {
        vk.b.c(eVar, "source is null");
        return cl.a.i(new yk.b(eVar));
    }

    @Override // ok.f
    public final void a(g gVar) {
        vk.b.c(gVar, "observer is null");
        try {
            g gVarM = cl.a.m(this, gVar);
            vk.b.c(gVarM, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            h(gVarM);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            sk.a.b(th2);
            cl.a.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final c d(h hVar) {
        return e(hVar, false, b());
    }

    public final c e(h hVar, boolean z10, int i10) {
        vk.b.c(hVar, "scheduler is null");
        vk.b.d(i10, "bufferSize");
        return cl.a.i(new yk.c(this, hVar, z10, i10));
    }

    public final rk.b f(tk.c cVar, tk.c cVar2) {
        return g(cVar, cVar2, vk.a.f55664c, vk.a.a());
    }

    public final rk.b g(tk.c cVar, tk.c cVar2, tk.a aVar, tk.c cVar3) {
        vk.b.c(cVar, "onNext is null");
        vk.b.c(cVar2, "onError is null");
        vk.b.c(aVar, "onComplete is null");
        vk.b.c(cVar3, "onSubscribe is null");
        xk.b bVar = new xk.b(cVar, cVar2, aVar, cVar3);
        a(bVar);
        return bVar;
    }

    protected abstract void h(g gVar);

    public final c i(h hVar) {
        vk.b.c(hVar, "scheduler is null");
        return cl.a.i(new yk.d(this, hVar));
    }
}
