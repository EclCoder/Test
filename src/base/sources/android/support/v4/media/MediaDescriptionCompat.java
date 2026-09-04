package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharSequence f503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaDescription f508i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f516h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f509a, this.f510b, this.f511c, this.f512d, this.f513e, this.f514f, this.f515g, this.f516h);
        }

        public d b(CharSequence charSequence) {
            this.f512d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f515g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f513e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f514f = uri;
            return this;
        }

        public d f(String str) {
            this.f509a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f516h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f511c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f510b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f500a = str;
        this.f501b = charSequence;
        this.f502c = charSequence2;
        this.f503d = charSequence3;
        this.f504e = bitmap;
        this.f505f = uri;
        this.f506g = bundle;
        this.f507h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle bundleD = b.d(mediaDescription);
        if (bundleD != null) {
            bundleD = MediaSessionCompat.b(bundleD);
        }
        Uri uri = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleD;
        } else if (!bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleD.size() != 2) {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        dVar.c(bundle);
        if (uri != null) {
            dVar.g(uri);
        } else {
            dVar.g(c.a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = dVar.a();
        mediaDescriptionCompatA.f508i = mediaDescription;
        return mediaDescriptionCompatA;
    }

    public Object b() {
        MediaDescription mediaDescription = this.f508i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = b.b();
        b.n(builderB, this.f500a);
        b.p(builderB, this.f501b);
        b.o(builderB, this.f502c);
        b.j(builderB, this.f503d);
        b.l(builderB, this.f504e);
        b.m(builderB, this.f505f);
        b.k(builderB, this.f506g);
        c.b(builderB, this.f507h);
        MediaDescription mediaDescriptionA = b.a(builderB);
        this.f508i = mediaDescriptionA;
        return mediaDescriptionA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f501b) + ", " + ((Object) this.f502c) + ", " + ((Object) this.f503d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) b()).writeToParcel(parcel, i10);
    }
}
