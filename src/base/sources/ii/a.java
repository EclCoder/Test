package ii;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements Box {
    private Container parent;
    private final String type;

    public a(String str) {
        this.type = str;
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getOffset() {
        throw new RuntimeException("It's a´write only box");
    }

    @Override // com.coremedia.iso.boxes.Box
    public Container getParent() {
        return this.parent;
    }

    @Override // com.coremedia.iso.boxes.Box
    public String getType() {
        return this.type;
    }

    @Override // com.coremedia.iso.boxes.Box
    public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        throw new RuntimeException("It's a´write only box");
    }

    @Override // com.coremedia.iso.boxes.Box
    public void setParent(Container container) {
        this.parent = container;
    }
}
