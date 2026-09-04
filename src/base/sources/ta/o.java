package ta;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f53263a = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements o {
        a() {
        }

        @Override // ta.o
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // ta.o
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // ta.o
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
