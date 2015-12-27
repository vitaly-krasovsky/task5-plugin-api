package com.epam.mentoring.plugin;

/**
 * Interface for all plugins used in app.
 * All plugins must have the configuration file at the top level of ***.jar with name plugin-config.
 * Structure of this file:
 * name=<plugin name></>
 * clazz=<plugin clazz>
 * description=<plugin description></>
 * Example:
 * name=PRINT MESSAGE PLUGIN
 * clazz=com.epam.mentoring.plugin.PrintMessagePlugin
 * description=(Prints input. Input -> your message.)
 *
 * @author vkrasovsky
 */
public interface Plugin {
    /**
     * Executes plugin body.
     *
     * @param input the input
     */
    void processInput(String input);
}
