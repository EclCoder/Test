package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    List f545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final long f546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Bundle f547k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bundle f551d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f548a = parcel.readString();
            this.f549b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f550c = parcel.readInt();
            this.f551d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f549b) + ", mIcon=" + this.f550c + ", mExtras=" + this.f551d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f548a);
            TextUtils.writeToParcel(this.f549b, parcel, i10);
            parcel.writeInt(this.f550c);
            parcel.writeBundle(this.f551d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f537a = parcel.readInt();
        this.f538b = parcel.readLong();
        this.f540d = parcel.readFloat();
        this.f544h = parcel.readLong();
        this.f539c = parcel.readLong();
        this.f541e = parcel.readLong();
        this.f543g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f545i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f546j = parcel.readLong();
        this.f547k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f542f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f537a + ", position=" + this.f538b + ", buffered position=" + this.f539c + ", speed=" + this.f540d + ", updated=" + this.f544h + ", actions=" + this.f541e + ", error code=" + this.f542f + ", error message=" + this.f543g + ", custom actions=" + this.f545i + ", active item id=" + this.f546j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f537a);
        parcel.writeLong(this.f538b);
        parcel.writeFloat(this.f540d);
        parcel.writeLong(this.f544h);
        parcel.writeLong(this.f539c);
        parcel.writeLong(this.f541e);
        TextUtils.writeToParcel(this.f543g, parcel, i10);
        parcel.writeTypedList(this.f545i);
        parcel.writeLong(this.f546j);
        parcel.writeBundle(this.f547k);
        parcel.writeInt(this.f542f);
    }
}
