package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f15248f = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f15250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f15251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f15253e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f15254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f15255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f15256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f15257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f15258e;

        public a(Context context, Uri imageUri) {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(imageUri, "imageUri");
            this.f15254a = context;
            this.f15255b = imageUri;
        }

        public final j0 a() {
            Context context = this.f15254a;
            Uri uri = this.f15255b;
            b bVar = this.f15256c;
            boolean z10 = this.f15257d;
            Object obj = this.f15258e;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return new j0(context, uri, bVar, z10, obj, null);
        }

        public final a b(boolean z10) {
            this.f15257d = z10;
            return this;
        }

        public final a c(b bVar) {
            this.f15256c = bVar;
            return this;
        }

        public final a d(Object obj) {
            this.f15258e = obj;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.s.c(this.f15254a, aVar.f15254a) && kotlin.jvm.internal.s.c(this.f15255b, aVar.f15255b);
        }

        public int hashCode() {
            return (this.f15254a.hashCode() * 31) + this.f15255b.hashCode();
        }

        public String toString() {
            return "Builder(context=" + this.f15254a + ", imageUri=" + this.f15255b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(k0 k0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(String str, int i10, int i11, String str2) {
            f1.n(str, "userId");
            int iMax = Math.max(i10, 0);
            int iMax2 = Math.max(i11, 0);
            if (iMax == 0 && iMax2 == 0) {
                throw new IllegalArgumentException("Either width or height must be greater than 0");
            }
            Uri.Builder builderBuildUpon = Uri.parse(x0.h()).buildUpon();
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str3 = String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{com.facebook.h0.y(), str}, 2));
            kotlin.jvm.internal.s.g(str3, "format(locale, format, *args)");
            Uri.Builder builderPath = builderBuildUpon.path(str3);
            if (iMax2 != 0) {
                builderPath.appendQueryParameter("height", String.valueOf(iMax2));
            }
            if (iMax != 0) {
                builderPath.appendQueryParameter("width", String.valueOf(iMax));
            }
            builderPath.appendQueryParameter("migration_overrides", "{october_2012:true}");
            if (!e1.e0(str2)) {
                builderPath.appendQueryParameter("access_token", str2);
            } else if (e1.e0(com.facebook.h0.t()) || e1.e0(com.facebook.h0.n())) {
                Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
            } else {
                builderPath.appendQueryParameter("access_token", com.facebook.h0.n() + '|' + com.facebook.h0.t());
            }
            Uri uriBuild = builderPath.build();
            kotlin.jvm.internal.s.g(uriBuild, "builder.build()");
            return uriBuild;
        }

        private c() {
        }
    }

    public /* synthetic */ j0(Context context, Uri uri, b bVar, boolean z10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, bVar, z10, obj);
    }

    public final b a() {
        return this.f15251c;
    }

    public final Object b() {
        return this.f15253e;
    }

    public final Uri c() {
        return this.f15250b;
    }

    public final boolean d() {
        return this.f15252d;
    }

    private j0(Context context, Uri uri, b bVar, boolean z10, Object obj) {
        this.f15249a = context;
        this.f15250b = uri;
        this.f15251c = bVar;
        this.f15252d = z10;
        this.f15253e = obj;
    }
}
