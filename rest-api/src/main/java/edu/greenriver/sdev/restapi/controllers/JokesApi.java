package edu.greenriver.sdev.restapi.controllers;

import edu.greenriver.sdev.restapi.model.Joke;
import edu.greenriver.sdev.restapi.services.JokesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create an endpoint at http://localhost:8080/jokes
 *
 */
@RestController
public class JokesApi
{
    private JokesService service;

    public JokesApi(JokesService service)
    {
        this.service = service;
    }

    @GetMapping("jokes")
    public List<Joke> getAllJokes()
    {
        return service.getJokes();
    }

    @GetMapping("jokes/{jokeId}")
    public Joke getSingleJoke(@PathVariable int jokeId)
    {
        return service.getJokeById(jokeId);
    }

    @PostMapping("jokes")
    public Joke addJoke(@RequestBody Joke joke)
    {
        return service.addJoke(joke);
    }

    @PutMapping("jokes/{jokeId}")
    public Joke updateJoke(@PathVariable int jokeId, @RequestBody Joke joke)
    {
        return service.editJoke(jokeId, joke);
    }

    @DeleteMapping("jokes/{jokeId}")
    public void deleteJoke(@PathVariable int jokeId)
    {
        service.deleteJoke(jokeId);
    }
}
