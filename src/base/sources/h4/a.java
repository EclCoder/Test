package h4;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.i;
import androidx.privacysandbox.ads.adservices.measurement.j;
import androidx.privacysandbox.ads.adservices.measurement.k;
import com.google.common.util.concurrent.ListenableFuture;
import em.c1;
import em.o0;
import em.p0;
import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f40222a = new b(null);

    /* JADX INFO: renamed from: h4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0601a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.privacysandbox.ads.adservices.measurement.b f40223b;

        /* JADX INFO: renamed from: h4.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0602a extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40224r;

            C0602a(androidx.privacysandbox.ads.adservices.measurement.a aVar, kl.f fVar) {
                super(2, fVar);
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((C0602a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return C0601a.this.new C0602a(null, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f40224r;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0601a.this.f40223b;
                    this.f40224r = 1;
                    if (bVar.a(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f38750a;
            }
        }

        /* JADX INFO: renamed from: h4.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40226r;

            b(kl.f fVar) {
                super(2, fVar);
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return C0601a.this.new b(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f40226r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                s.b(obj);
                androidx.privacysandbox.ads.adservices.measurement.b bVar = C0601a.this.f40223b;
                this.f40226r = 1;
                Object objB = bVar.b(this);
                return objB == objF ? objF : objB;
            }
        }

        /* JADX INFO: renamed from: h4.a$a$c */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class c extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40228r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Uri f40230t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ InputEvent f40231u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, kl.f fVar) {
                super(2, fVar);
                this.f40230t = uri;
                this.f40231u = inputEvent;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return C0601a.this.new c(this.f40230t, this.f40231u, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f40228r;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0601a.this.f40223b;
                    Uri uri = this.f40230t;
                    InputEvent inputEvent = this.f40231u;
                    this.f40228r = 1;
                    if (bVar.c(uri, inputEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f38750a;
            }
        }

        /* JADX INFO: renamed from: h4.a$a$d */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class d extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40232r;

            d(i iVar, kl.f fVar) {
                super(2, fVar);
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((d) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return C0601a.this.new d(null, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f40232r;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0601a.this.f40223b;
                    this.f40232r = 1;
                    if (bVar.d(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f38750a;
            }
        }

        /* JADX INFO: renamed from: h4.a$a$e */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class e extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40234r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Uri f40236t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, kl.f fVar) {
                super(2, fVar);
                this.f40236t = uri;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((e) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return C0601a.this.new e(this.f40236t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f40234r;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0601a.this.f40223b;
                    Uri uri = this.f40236t;
                    this.f40234r = 1;
                    if (bVar.e(uri, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f38750a;
            }
        }

        /* JADX INFO: renamed from: h4.a$a$f */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class f extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40237r;

            f(j jVar, kl.f fVar) {
                super(2, fVar);
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((f) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return C0601a.this.new f(null, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f40237r;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0601a.this.f40223b;
                    this.f40237r = 1;
                    if (bVar.f(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f38750a;
            }
        }

        /* JADX INFO: renamed from: h4.a$a$g */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class g extends m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f40239r;

            g(k kVar, kl.f fVar) {
                super(2, fVar);
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((g) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return C0601a.this.new g(null, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f40239r;
                if (i10 == 0) {
                    s.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0601a.this.f40223b;
                    this.f40239r = 1;
                    if (bVar.g(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f38750a;
            }
        }

        public C0601a(androidx.privacysandbox.ads.adservices.measurement.b mMeasurementManager) {
            kotlin.jvm.internal.s.h(mMeasurementManager, "mMeasurementManager");
            this.f40223b = mMeasurementManager;
        }

        @Override // h4.a
        public ListenableFuture b() {
            return g4.b.c(em.k.b(p0.a(c1.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // h4.a
        public ListenableFuture c(Uri attributionSource, InputEvent inputEvent) {
            kotlin.jvm.internal.s.h(attributionSource, "attributionSource");
            return g4.b.c(em.k.b(p0.a(c1.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // h4.a
        public ListenableFuture d(Uri trigger) {
            kotlin.jvm.internal.s.h(trigger, "trigger");
            return g4.b.c(em.k.b(p0.a(c1.a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        public ListenableFuture f(androidx.privacysandbox.ads.adservices.measurement.a deletionRequest) {
            kotlin.jvm.internal.s.h(deletionRequest, "deletionRequest");
            return g4.b.c(em.k.b(p0.a(c1.a()), null, null, new C0602a(deletionRequest, null), 3, null), null, 1, null);
        }

        public ListenableFuture g(i request) {
            kotlin.jvm.internal.s.h(request, "request");
            return g4.b.c(em.k.b(p0.a(c1.a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        public ListenableFuture h(j request) {
            kotlin.jvm.internal.s.h(request, "request");
            return g4.b.c(em.k.b(p0.a(c1.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        public ListenableFuture i(k request) {
            kotlin.jvm.internal.s.h(request, "request");
            return g4.b.c(em.k.b(p0.a(c1.a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            androidx.privacysandbox.ads.adservices.measurement.b bVarA = androidx.privacysandbox.ads.adservices.measurement.b.f6515a.a(context);
            if (bVarA != null) {
                return new C0601a(bVarA);
            }
            return null;
        }

        private b() {
        }
    }

    public static final a a(Context context) {
        return f40222a.a(context);
    }

    public abstract ListenableFuture b();

    public abstract ListenableFuture c(Uri uri, InputEvent inputEvent);

    public abstract ListenableFuture d(Uri uri);
}
