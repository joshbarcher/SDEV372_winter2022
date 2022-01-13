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

    @PostMapping("jokes")
    public void addJoke(Joke joke)
    {
        service.addJoke(joke);
    }

    @PutMapping("jokes")
    public void updateJoke(Joke joke)
    {

    }

    @DeleteMapping("jokes")
    public void deleteJoke()
    {

    }
}
