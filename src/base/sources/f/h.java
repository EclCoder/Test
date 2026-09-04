package f;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntentSender f38142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f38143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f38141e = new c(null);
    public static final Parcelable.Creator<h> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IntentSender f38146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f38147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f38148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f38149d;

        public a(IntentSender intentSender) {
            s.h(intentSender, "intentSender");
            this.f38146a = intentSender;
        }

        public final h a() {
            return new h(this.f38146a, this.f38147b, this.f38148c, this.f38149d);
        }

        public final a b(Intent intent) {
            this.f38147b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f38149d = i10;
            this.f38148c = i11;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            s.h(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            s.g(intentSender, "getIntentSender(...)");
            this(intentSender);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel inParcel) {
            s.h(inParcel, "inParcel");
            return new h(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        s.h(intentSender, "intentSender");
        this.f38142a = intentSender;
        this.f38143b = intent;
        this.f38144c = i10;
        this.f38145d = i11;
    }

    public final Intent a() {
        return this.f38143b;
    }

    public final int b() {
        return this.f38144c;
    }

    public final int c() {
        return this.f38145d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final IntentSender e() {
        return this.f38142a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        s.h(dest, "dest");
        dest.writeParcelable(this.f38142a, i10);
        dest.writeParcelable(this.f38143b, i10);
        dest.writeInt(this.f38144c);
        dest.writeInt(this.f38145d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Parcel parcel) {
        s.h(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        s.e(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
