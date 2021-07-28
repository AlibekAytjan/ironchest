package com.progwml6.ironchest.common.block;

import com.progwml6.ironchest.common.block.entity.IronChestBlockEntity;
import com.progwml6.ironchest.common.block.entity.IronChestsBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class IronChestBlock extends AbstractIronChestBlock {

  public IronChestBlock(Properties properties) {
    super(properties, IronChestsBlockEntityTypes.IRON_CHEST::get, IronChestsTypes.IRON);
  }

  @Nullable
  @Override
  public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
    return new IronChestBlockEntity(blockPos, blockState);
  }
}
