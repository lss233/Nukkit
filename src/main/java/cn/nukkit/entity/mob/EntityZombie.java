package cn.nukkit.entity.mob;

import cn.nukkit.entity.EntityType;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

/**
 * Created by Dr. Nick Doran on 4/23/2017.
 */
public class EntityZombie extends EntityMob {

    public static final int NETWORK_ID = 32;

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    @Override
    public EntityType getEntityType() {
        return EntityType.ZOMBIE;
    }

    public EntityZombie(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    protected void initEntity() {
        super.initEntity();
        this.setMaxHealth(20);
    }

    @Override
    public float getWidth() {
        return 0.6f;
    }

    @Override
    public float getHeight() {
        return 1.95f;
    }

    @Override
    public String getName() {
        return "Zombie";
    }
}
