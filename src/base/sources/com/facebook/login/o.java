package com.facebook.login;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends f0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f15674o = new b(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final fl.k f15675p = fl.l.b(a.f15677a);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Uri f15676n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15677a = new a();

        a() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            return (o) o.P().getValue();
        }

        private b() {
        }
    }

    public static final /* synthetic */ fl.k P() {
        if (x7.a.c(o.class)) {
            return null;
        }
        try {
            return f15675p;
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
            return null;
        }
    }

    public final void Q(Uri uri) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            this.f15676n = uri;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
