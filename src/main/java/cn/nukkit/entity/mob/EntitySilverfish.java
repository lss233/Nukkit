package cn.nukkit.entity.mob;

import cn.nukkit.entity.EntityType;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

/**
 * @author PikyCZ
 */
public class EntitySilverfish extends EntityMob {

    public static final int NETWORK_ID = 39;

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SILVERFISH;
    }

    public EntitySilverfish(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public String getName() {
        return "Silverfish";
    }

    @Override
    public float getWidth() {
        return 0.4f;
    }

    @Override
    public float getHeight() {
        return 0.3f;
    }

    @Override
    public void initEntity() {
        super.initEntity();
        this.setMaxHealth(8);
    }
}
