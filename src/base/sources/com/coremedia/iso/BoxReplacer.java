package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.util.Path;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class BoxReplacer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void replace(Map<String, Box> map, File file) throws IOException {
        IsoFile isoFile = new IsoFile(new FileDataSourceImpl(new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R).getChannel()));
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Map.Entry<String, Box> entry : map.entrySet()) {
            Box path = Path.getPath(isoFile, entry.getKey());
            map2.put(Path.createPath(path), entry.getValue());
            map3.put(Path.createPath(path), Long.valueOf(path.getOffset()));
        }
        isoFile.close();
        FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
        for (String str : map2.keySet()) {
            Box box = (Box) map2.get(str);
            channel.position(((Long) map3.get(str)).longValue());
            box.getBox(channel);
        }
        channel.close();
    }
}
