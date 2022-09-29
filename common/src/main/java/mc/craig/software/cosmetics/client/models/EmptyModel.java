package mc.craig.software.cosmetics.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


/* Created by Craig on 11/03/2021 */
public class EmptyModel extends PlayerModel<LivingEntity> {

    public EmptyModel(ModelPart modelPart, boolean bl) {
        super(modelPart, bl);
    }
}
