package com.facebook;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface r {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Intent f15991c;

        public a(int i10, int i11, Intent intent) {
            this.f15989a = i10;
            this.f15990b = i11;
            this.f15991c = intent;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15989a == aVar.f15989a && this.f15990b == aVar.f15990b && kotlin.jvm.internal.s.c(this.f15991c, aVar.f15991c);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.f15989a) * 31) + Integer.hashCode(this.f15990b)) * 31;
            Intent intent = this.f15991c;
            return iHashCode + (intent == null ? 0 : intent.hashCode());
        }

        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.f15989a + ", resultCode=" + this.f15990b + ", data=" + this.f15991c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15992a = new b();

        public static final r a() {
            return new com.facebook.internal.e();
        }
    }

    boolean onActivityResult(int i10, int i11, Intent intent);
}
