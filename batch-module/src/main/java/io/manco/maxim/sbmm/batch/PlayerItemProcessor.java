package io.manco.maxim.sbmm.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import io.manco.maxim.sbmm.batch.model.Player;

public class PlayerItemProcessor implements ItemProcessor<Player, Player> {

	private static final Logger log = LoggerFactory.getLogger(PlayerItemProcessor.class);

    @Override
    public Player process(final Player person) throws Exception {
        final String id = person.getId().toUpperCase();
        final String name = person.getName().toUpperCase();

        final Player transformedPerson = new Player(id, name);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }
	
}
