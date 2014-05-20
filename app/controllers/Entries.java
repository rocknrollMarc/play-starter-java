package controllers;

import play.mvc.*;

    public class Entries extends Controller {

        public  static Result list(String filter) {
            Seq<Entry> entries = models.Entries.findByName(filter);
            return return ok(views.html.index.render(entries));
        }

        public static Result remove(long id) {
            return TODO;
        }

        public static Result add() {
            return TODO;
        }

        public static  Result edit(long id) {
            return TODO;
        }

        public static Result save() {
            return TODO;
        }
    }